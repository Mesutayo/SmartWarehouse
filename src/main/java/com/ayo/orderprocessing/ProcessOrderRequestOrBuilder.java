// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OrderProcessingService.proto

package com.ayo.orderprocessing;

public interface ProcessOrderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ayo.orderprocessing.ProcessOrderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string order_id = 1;</code>
   */
  java.lang.String getOrderId();
  /**
   * <code>string order_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <code>repeated .com.ayo.orderprocessing.ProcessOrderRequest.OrderItem items = 2;</code>
   */
  java.util.List<com.ayo.orderprocessing.ProcessOrderRequest.OrderItem> 
      getItemsList();
  /**
   * <code>repeated .com.ayo.orderprocessing.ProcessOrderRequest.OrderItem items = 2;</code>
   */
  com.ayo.orderprocessing.ProcessOrderRequest.OrderItem getItems(int index);
  /**
   * <code>repeated .com.ayo.orderprocessing.ProcessOrderRequest.OrderItem items = 2;</code>
   */
  int getItemsCount();
  /**
   * <code>repeated .com.ayo.orderprocessing.ProcessOrderRequest.OrderItem items = 2;</code>
   */
  java.util.List<? extends com.ayo.orderprocessing.ProcessOrderRequest.OrderItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <code>repeated .com.ayo.orderprocessing.ProcessOrderRequest.OrderItem items = 2;</code>
   */
  com.ayo.orderprocessing.ProcessOrderRequest.OrderItemOrBuilder getItemsOrBuilder(
      int index);
}