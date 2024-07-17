package com.alura.literalura.service;

public interface IConvertData {
    <T> T getDates (String json, Class<T> tClass);
}