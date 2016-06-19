package com.epri._2016.executedergroupdispatches;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2016-06-12T10:32:05.934-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://www.epri.com/2016/ExecuteDERGroupDispatches", name = "DERGroupDispatches_Port")
@XmlSeeAlso({ch.iec.tc57._2011.schema.message.ObjectFactory.class, com.epri._2016.dergroupdispatchesmessage.ObjectFactory.class, com.epri._2013.dergroupdispatches.ObjectFactory.class})
public interface DERGroupDispatchesPort {

    @RequestWrapper(localName = "CreateDERGroupDispatches", targetNamespace = "http://www.epri.com/2016/DERGroupDispatchesMessage", className = "com.epri._2016.dergroupdispatchesmessage.DERGroupDispatchesRequestMessageType")
    @WebMethod(operationName = "CreateDERGroupDispatches", action = "http://www.epri.com/2016/DERGroupDispatches/CreateDERGroupDispatches")
    @ResponseWrapper(localName = "DERGroupDispatchesResponseMessage", targetNamespace = "http://www.epri.com/2016/DERGroupDispatchesMessage", className = "com.epri._2016.dergroupdispatchesmessage.DERGroupDispatchesResponseMessageType")
    public void createDERGroupDispatches(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.epri.com/2016/DERGroupDispatchesMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.epri.com/2016/DERGroupDispatchesMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.epri.com/2016/DERGroupDispatchesMessage")
        javax.xml.ws.Holder<com.epri._2016.dergroupdispatchesmessage.DERGroupDispatchesPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.epri.com/2016/DERGroupDispatchesMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;
}