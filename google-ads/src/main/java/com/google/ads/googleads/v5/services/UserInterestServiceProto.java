// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/user_interest_service.proto

package com.google.ads.googleads.v5.services;

public final class UserInterestServiceProto {
  private UserInterestServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_GetUserInterestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_GetUserInterestRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v5/services/user_" +
      "interest_service.proto\022 google.ads.googl" +
      "eads.v5.services\0325google/ads/googleads/v" +
      "5/resources/user_interest.proto\032\034google/" +
      "api/annotations.proto\032\027google/api/client" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\"^\n\026GetUserInt" +
      "erestRequest\022D\n\rresource_name\030\001 \001(\tB-\340A\002" +
      "\372A\'\n%googleads.googleapis.com/UserIntere" +
      "st2\372\001\n\023UserInterestService\022\305\001\n\017GetUserIn" +
      "terest\0228.google.ads.googleads.v5.service" +
      "s.GetUserInterestRequest\032/.google.ads.go" +
      "ogleads.v5.resources.UserInterest\"G\202\323\344\223\002" +
      "1\022//v5/{resource_name=customers/*/userIn" +
      "terests/*}\332A\rresource_name\032\033\312A\030googleads" +
      ".googleapis.comB\377\001\n$com.google.ads.googl" +
      "eads.v5.servicesB\030UserInterestServicePro" +
      "toP\001ZHgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v5/services;services\242\002" +
      "\003GAA\252\002 Google.Ads.GoogleAds.V5.Services\312" +
      "\002 Google\\Ads\\GoogleAds\\V5\\Services\352\002$Goo" +
      "gle::Ads::GoogleAds::V5::Servicesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.resources.UserInterestProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_services_GetUserInterestRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_services_GetUserInterestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_GetUserInterestRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.resources.UserInterestProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
