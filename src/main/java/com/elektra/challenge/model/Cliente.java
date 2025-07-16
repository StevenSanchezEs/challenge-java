package com.elektra.challenge.model;

public record Cliente(
    String id,
    String nombre,
    String email,
    int edad,
    TipoCliente tipoCliente
) {}