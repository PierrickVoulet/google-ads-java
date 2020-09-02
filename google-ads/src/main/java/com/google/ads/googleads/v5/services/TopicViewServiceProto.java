// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/topic_view_service.proto

package com.google.ads.googleads.v5.services;

public final class TopicViewServiceProto {
  private TopicViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_GetTopicViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_GetTopicViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v5/services/topic" +
      "_view_service.proto\022 google.ads.googlead" +
      "s.v5.services\0322google/ads/googleads/v5/r" +
      "esources/topic_view.proto\032\034google/api/an" +
      "notations.proto\032\027google/api/client.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\"X\n\023GetTopicViewRequ" +
      "est\022A\n\rresource_name\030\001 \001(\tB*\340A\002\372A$\n\"goog" +
      "leads.googleapis.com/TopicView2\353\001\n\020Topic" +
      "ViewService\022\271\001\n\014GetTopicView\0225.google.ad" +
      "s.googleads.v5.services.GetTopicViewRequ" +
      "est\032,.google.ads.googleads.v5.resources." +
      "TopicView\"D\202\323\344\223\002.\022,/v5/{resource_name=cu" +
      "stomers/*/topicViews/*}\332A\rresource_name\032" +
      "\033\312A\030googleads.googleapis.comB\374\001\n$com.goo" +
      "gle.ads.googleads.v5.servicesB\025TopicView" +
      "ServiceProtoP\001ZHgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v5/services;" +
      "services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V5" +
      ".Services\312\002 Google\\Ads\\GoogleAds\\V5\\Serv" +
      "ices\352\002$Google::Ads::GoogleAds::V5::Servi" +
      "cesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.resources.TopicViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_services_GetTopicViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_services_GetTopicViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_GetTopicViewRequest_descriptor,
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
    com.google.ads.googleads.v5.resources.TopicViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
