///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package lab3.AddResource.endpoint;
//
//import java.io.StringWriter;
//import java.util.Collection;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.UriInfo;
//import javax.ws.rs.Produces;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.PUT;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.core.MediaType;
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;
//
///**
// * REST Web Service
// *
// * @author student
// */
//@Path("Add")
//public class AddResource {
//
//    @Context
//    private UriInfo context;
//
//    /**
//     * Creates a new instance of AddResource
//     */
//    public AddResource() {
//    }
//
//    /**
//     * Retrieves representation of an instance of
//     * AddResource.endpoint.AddResource
//     *
//     * @return an instance of java.lang.String
//     */
//    @GET
//    @Produces(MediaType.APPLICATION_XML + ";charset=utf-8")
//    public String getXml(@PathParam("query") String query) {
//        SearchBusiness search = new SearchBusiness();
//        BooksXML books = search.getBooksByQuery(query);
//        System.out.println(">>>>>>>>>>>>>>>>>>" + books);
//
//        JAXBContext jaxbContext;
//        try {
//            jaxbContext = JAXBContext.newInstance(BooksXML.class);
//
//            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//
//            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//            StringWriter sw = new StringWriter();
//            jaxbMarshaller.marshal(books, sw);
//
//            return (sw.toString());
//
//        } catch (JAXBException ex) {
//            Logger.getLogger(SearchResource.class.getName()).log(Level.SEVERE, null, ex);
//            return ("error happened");
//        }
//    }
//
//    /**
//     * PUT method for updating or creating an instance of AddResource
//     *
//     * @param content representation for the resource
//     */
//    @PUT
//    @Consumes(MediaType.APPLICATION_XML)
//    public void putXml(String content) {
//    }
//}
