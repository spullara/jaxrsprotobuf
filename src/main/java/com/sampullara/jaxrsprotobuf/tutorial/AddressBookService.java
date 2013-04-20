package com.sampullara.jaxrsprotobuf.tutorial;

import javax.ws.rs.*;

@Path("/person")
public class AddressBookService {
    @GET
    @Produces("application/x-protobuf")
    public AddressBookProtos.Person getPerson() {
        return AddressBookProtos.Person.newBuilder()
                .setId(1)
                .setName("Sam")
                .setEmail("sam@sampullara.com")
                .addPhone(AddressBookProtos.Person.PhoneNumber.newBuilder()
                        .setNumber("415-555-1212")
                        .setType(AddressBookProtos.Person.PhoneType.MOBILE)
                        .build())
                .build();
    }

    @POST
    @Consumes("application/x-protobuf")
    @Produces("application/x-protobuf")
    public AddressBookProtos.Person reflect(AddressBookProtos.Person person) {
        return person;
    }
}
