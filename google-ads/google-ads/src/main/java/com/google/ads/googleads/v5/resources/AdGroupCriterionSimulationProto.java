// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/ad_group_criterion_simulation.proto

package com.google.ads.googleads.v5.resources;

public final class AdGroupCriterionSimulationProto {
  private AdGroupCriterionSimulationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_AdGroupCriterionSimulation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_AdGroupCriterionSimulation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v5/resources/ad_g" +
      "roup_criterion_simulation.proto\022!google." +
      "ads.googleads.v5.resources\032/google/ads/g" +
      "oogleads/v5/common/simulation.proto\032Bgoo" +
      "gle/ads/googleads/v5/enums/simulation_mo" +
      "dification_method.proto\0323google/ads/goog" +
      "leads/v5/enums/simulation_type.proto\032\037go" +
      "ogle/api/field_behavior.proto\032\031google/ap" +
      "i/resource.proto\032\034google/api/annotations" +
      ".proto\"\365\005\n\032AdGroupCriterionSimulation\022R\n" +
      "\rresource_name\030\001 \001(\tB;\340A\003\372A5\n3googleads." +
      "googleapis.com/AdGroupCriterionSimulatio" +
      "n\022\035\n\013ad_group_id\030\t \001(\003B\003\340A\003H\001\210\001\001\022\036\n\014crit" +
      "erion_id\030\n \001(\003B\003\340A\003H\002\210\001\001\022S\n\004type\030\004 \001(\0162@" +
      ".google.ads.googleads.v5.enums.Simulatio" +
      "nTypeEnum.SimulationTypeB\003\340A\003\022~\n\023modific" +
      "ation_method\030\005 \001(\0162\\.google.ads.googlead" +
      "s.v5.enums.SimulationModificationMethodE" +
      "num.SimulationModificationMethodB\003\340A\003\022\034\n" +
      "\nstart_date\030\013 \001(\tB\003\340A\003H\003\210\001\001\022\032\n\010end_date\030" +
      "\014 \001(\tB\003\340A\003H\004\210\001\001\022\\\n\022cpc_bid_point_list\030\010 " +
      "\001(\01329.google.ads.googleads.v5.common.Cpc" +
      "BidSimulationPointListB\003\340A\003H\000:\213\001\352A\207\001\n3go" +
      "ogleads.googleapis.com/AdGroupCriterionS" +
      "imulation\022Pcustomers/{customer}/adGroupC" +
      "riterionSimulations/{ad_group_criterion_" +
      "simulation}B\014\n\npoint_listB\016\n\014_ad_group_i" +
      "dB\017\n\r_criterion_idB\r\n\013_start_dateB\013\n\t_en" +
      "d_dateB\214\002\n%com.google.ads.googleads.v5.r" +
      "esourcesB\037AdGroupCriterionSimulationProt" +
      "oP\001ZJgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v5/resources;resources\242" +
      "\002\003GAA\252\002!Google.Ads.GoogleAds.V5.Resource" +
      "s\312\002!Google\\Ads\\GoogleAds\\V5\\Resources\352\002%" +
      "Google::Ads::GoogleAds::V5::Resourcesb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.common.SimulationProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.SimulationModificationMethodProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.SimulationTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_AdGroupCriterionSimulation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_AdGroupCriterionSimulation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_AdGroupCriterionSimulation_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupId", "CriterionId", "Type", "ModificationMethod", "StartDate", "EndDate", "CpcBidPointList", "PointList", "AdGroupId", "CriterionId", "StartDate", "EndDate", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.common.SimulationProto.getDescriptor();
    com.google.ads.googleads.v5.enums.SimulationModificationMethodProto.getDescriptor();
    com.google.ads.googleads.v5.enums.SimulationTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}