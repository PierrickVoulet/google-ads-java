// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/custom_interest_service.proto

package com.google.ads.googleads.v5.services;

public interface MutateCustomInterestsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.services.MutateCustomInterestsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer whose custom interests are being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer whose custom interests are being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The list of operations to perform on individual custom interests.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v5.services.CustomInterestOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v5.services.CustomInterestOperation> 
      getOperationsList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual custom interests.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v5.services.CustomInterestOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v5.services.CustomInterestOperation getOperations(int index);
  /**
   * <pre>
   * Required. The list of operations to perform on individual custom interests.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v5.services.CustomInterestOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * Required. The list of operations to perform on individual custom interests.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v5.services.CustomInterestOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v5.services.CustomInterestOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual custom interests.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v5.services.CustomInterestOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v5.services.CustomInterestOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
