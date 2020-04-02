package com.ordermanagement.orderservice.services.commands;

import com.ordermanagement.orderservice.dto.commands.OrderCreateDTO;

import java.util.concurrent.CompletableFuture;

public interface OrderCommandService {

    public CompletableFuture<String> createOrder(OrderCreateDTO orderCreateDTO);

}
