package com.marcelosantosc.especialistaspring.Crest.A15JacksonXML;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
@JacksonXmlRootElement(localName = "root")
public class FooWrapper {


    @NonNull // construtor com lista vazia padrão

    @JacksonXmlElementWrapper(useWrapping = false) // Define que não vai ter um elemento List como wrapper do XML
    @JacksonXmlProperty(localName = "foo") // define o nome de cada elemento
    private List<FooDomainClass> fooDomainClasses;
}
