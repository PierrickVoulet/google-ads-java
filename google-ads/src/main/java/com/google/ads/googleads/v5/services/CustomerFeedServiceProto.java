// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/customer_feed_service.proto

package com.google.ads.googleads.v5.services;

public final class CustomerFeedServiceProto {
  private CustomerFeedServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_GetCustomerFeedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_GetCustomerFeedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_MutateCustomerFeedsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_MutateCustomerFeedsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_CustomerFeedOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_CustomerFeedOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_MutateCustomerFeedsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_MutateCustomerFeedsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_MutateCustomerFeedResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_MutateCustomerFeedResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v5/services/custo" +
      "mer_feed_service.proto\022 google.ads.googl" +
      "eads.v5.services\0329google/ads/googleads/v" +
      "5/enums/response_content_type.proto\0325goo" +
      "gle/ads/googleads/v5/resources/customer_" +
      "feed.proto\032\034google/api/annotations.proto" +
      "\032\027google/api/client.proto\032\037google/api/fi" +
      "eld_behavior.proto\032\031google/api/resource." +
      "proto\032 google/protobuf/field_mask.proto\032" +
      "\027google/rpc/status.proto\"^\n\026GetCustomerF" +
      "eedRequest\022D\n\rresource_name\030\001 \001(\tB-\340A\002\372A" +
      "\'\n%googleads.googleapis.com/CustomerFeed" +
      "\"\243\002\n\032MutateCustomerFeedsRequest\022\030\n\013custo" +
      "mer_id\030\001 \001(\tB\003\340A\002\022P\n\noperations\030\002 \003(\01327." +
      "google.ads.googleads.v5.services.Custome" +
      "rFeedOperationB\003\340A\002\022\027\n\017partial_failure\030\003" +
      " \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022i\n\025response_" +
      "content_type\030\005 \001(\0162J.google.ads.googlead" +
      "s.v5.enums.ResponseContentTypeEnum.Respo" +
      "nseContentType\"\355\001\n\025CustomerFeedOperation" +
      "\022/\n\013update_mask\030\004 \001(\0132\032.google.protobuf." +
      "FieldMask\022A\n\006create\030\001 \001(\0132/.google.ads.g" +
      "oogleads.v5.resources.CustomerFeedH\000\022A\n\006" +
      "update\030\002 \001(\0132/.google.ads.googleads.v5.r" +
      "esources.CustomerFeedH\000\022\020\n\006remove\030\003 \001(\tH" +
      "\000B\013\n\toperation\"\235\001\n\033MutateCustomerFeedsRe" +
      "sponse\0221\n\025partial_failure_error\030\003 \001(\0132\022." +
      "google.rpc.Status\022K\n\007results\030\002 \003(\0132:.goo" +
      "gle.ads.googleads.v5.services.MutateCust" +
      "omerFeedResult\"y\n\030MutateCustomerFeedResu" +
      "lt\022\025\n\rresource_name\030\001 \001(\t\022F\n\rcustomer_fe" +
      "ed\030\002 \001(\0132/.google.ads.googleads.v5.resou" +
      "rces.CustomerFeed2\347\003\n\023CustomerFeedServic" +
      "e\022\305\001\n\017GetCustomerFeed\0228.google.ads.googl" +
      "eads.v5.services.GetCustomerFeedRequest\032" +
      "/.google.ads.googleads.v5.resources.Cust" +
      "omerFeed\"G\202\323\344\223\0021\022//v5/{resource_name=cus" +
      "tomers/*/customerFeeds/*}\332A\rresource_nam" +
      "e\022\352\001\n\023MutateCustomerFeeds\022<.google.ads.g" +
      "oogleads.v5.services.MutateCustomerFeeds" +
      "Request\032=.google.ads.googleads.v5.servic" +
      "es.MutateCustomerFeedsResponse\"V\202\323\344\223\0027\"2" +
      "/v5/customers/{customer_id=*}/customerFe" +
      "eds:mutate:\001*\332A\026customer_id,operations\032\033" +
      "\312A\030googleads.googleapis.comB\377\001\n$com.goog" +
      "le.ads.googleads.v5.servicesB\030CustomerFe" +
      "edServiceProtoP\001ZHgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v5/service" +
      "s;services\242\002\003GAA\252\002 Google.Ads.GoogleAds." +
      "V5.Services\312\002 Google\\Ads\\GoogleAds\\V5\\Se" +
      "rvices\352\002$Google::Ads::GoogleAds::V5::Ser" +
      "vicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.resources.CustomerFeedProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_services_GetCustomerFeedRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_services_GetCustomerFeedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_GetCustomerFeedRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v5_services_MutateCustomerFeedsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v5_services_MutateCustomerFeedsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_MutateCustomerFeedsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v5_services_CustomerFeedOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v5_services_CustomerFeedOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_CustomerFeedOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v5_services_MutateCustomerFeedsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v5_services_MutateCustomerFeedsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_MutateCustomerFeedsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v5_services_MutateCustomerFeedResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v5_services_MutateCustomerFeedResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_MutateCustomerFeedResult_descriptor,
        new java.lang.String[] { "ResourceName", "CustomerFeed", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v5.resources.CustomerFeedProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
