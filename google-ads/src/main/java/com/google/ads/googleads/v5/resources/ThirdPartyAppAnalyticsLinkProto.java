// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/third_party_app_analytics_link.proto

package com.google.ads.googleads.v5.resources;

public final class ThirdPartyAppAnalyticsLinkProto {
  private ThirdPartyAppAnalyticsLinkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_ThirdPartyAppAnalyticsLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_ThirdPartyAppAnalyticsLink_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/ads/googleads/v5/resources/thir" +
      "d_party_app_analytics_link.proto\022!google" +
      ".ads.googleads.v5.resources\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\032\036google/protobuf/wrappers.proto\032" +
      "\034google/api/annotations.proto\"\275\002\n\032ThirdP" +
      "artyAppAnalyticsLink\022R\n\rresource_name\030\001 " +
      "\001(\tB;\340A\005\372A5\n3googleads.googleapis.com/Th" +
      "irdPartyAppAnalyticsLink\022<\n\021shareable_li" +
      "nk_id\030\002 \001(\0132\034.google.protobuf.StringValu" +
      "eB\003\340A\003:\214\001\352A\210\001\n3googleads.googleapis.com/" +
      "ThirdPartyAppAnalyticsLink\022Qcustomers/{c" +
      "ustomer}/thirdPartyAppAnalyticsLinks/{th" +
      "ird_party_app_analytics_link}B\214\002\n%com.go" +
      "ogle.ads.googleads.v5.resourcesB\037ThirdPa" +
      "rtyAppAnalyticsLinkProtoP\001ZJgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v5/resources;resources\242\002\003GAA\252\002!Google.Ad" +
      "s.GoogleAds.V5.Resources\312\002!Google\\Ads\\Go" +
      "ogleAds\\V5\\Resources\352\002%Google::Ads::Goog" +
      "leAds::V5::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_ThirdPartyAppAnalyticsLink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_ThirdPartyAppAnalyticsLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_ThirdPartyAppAnalyticsLink_descriptor,
        new java.lang.String[] { "ResourceName", "ShareableLinkId", });
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
