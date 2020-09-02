// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/user_location_view.proto

package com.google.ads.googleads.v5.resources;

public final class UserLocationViewProto {
  private UserLocationViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_UserLocationView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_UserLocationView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v5/resources/user" +
      "_location_view.proto\022!google.ads.googlea" +
      "ds.v5.resources\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032\036goo" +
      "gle/protobuf/wrappers.proto\032\034google/api/" +
      "annotations.proto\"\306\002\n\020UserLocationView\022H" +
      "\n\rresource_name\030\001 \001(\tB1\340A\003\372A+\n)googleads" +
      ".googleapis.com/UserLocationView\022>\n\024coun" +
      "try_criterion_id\030\002 \001(\0132\033.google.protobuf" +
      ".Int64ValueB\003\340A\003\022;\n\022targeting_location\030\003" +
      " \001(\0132\032.google.protobuf.BoolValueB\003\340A\003:k\352" +
      "Ah\n)googleads.googleapis.com/UserLocatio" +
      "nView\022;customers/{customer}/userLocation" +
      "Views/{user_location_view}B\202\002\n%com.googl" +
      "e.ads.googleads.v5.resourcesB\025UserLocati" +
      "onViewProtoP\001ZJgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v5/resources;" +
      "resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V" +
      "5.Resources\312\002!Google\\Ads\\GoogleAds\\V5\\Re" +
      "sources\352\002%Google::Ads::GoogleAds::V5::Re" +
      "sourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_UserLocationView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_UserLocationView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_UserLocationView_descriptor,
        new java.lang.String[] { "ResourceName", "CountryCriterionId", "TargetingLocation", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
