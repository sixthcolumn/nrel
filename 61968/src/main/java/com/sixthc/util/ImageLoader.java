package com.sixthc.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.multispeak.v5_0.wsdl.wo_server.WOServerSoap;

import com.google.common.io.ByteStreams;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ImageLoader {
	static Logger log = Logger.getLogger(WOServerSoap.class);

	public static void getImage(String url, String filename)
			throws ImageLoadFileException {
		WebResource resource = Client.create().resource(url);
		log.debug("save image : url = " + url + ", filename = " + filename);

		try {
			ClientResponse response = resource.get(ClientResponse.class);
			int r = response.getStatus();

			if (r != 200) {
				throw new ImageLoadFileException("image server returned code ("
						+ r + ") for " + url);
			}
			InputStream stream = response.getEntityInputStream();
			byte[] bytes;

			bytes = ByteStreams.toByteArray(stream);

			BufferedOutputStream bos = null;

			// create an object of FileOutputStream
			FileOutputStream fos;

			fos = new FileOutputStream(new File("/data/openwms/files/" + filename));
			// create an object of BufferedOutputStream
			bos = new BufferedOutputStream(fos);
			bos.write(bytes);
			bos.close();
			log.debug("url : " + url + ", filename : " + filename
					+ ", images bytes read : " + bytes.length);
		} catch (ImageLoadFileException fe) {
			log.error(fe);
			throw fe;
		}
		catch (Exception e) {
			log.error(e);
			throw new ImageLoadFileException("load for url " + url + " failed.", e);
		}
	}
}
