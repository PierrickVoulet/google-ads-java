// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/reach_plan_service.proto

package com.google.ads.googleads.v5.services;

public interface ForecastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.services.Forecast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency times that exactly
   * matches the Targeting.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value on_target_reach = 1;</code>
   * @return Whether the onTargetReach field is set.
   */
  boolean hasOnTargetReach();
  /**
   * <pre>
   * Number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency times that exactly
   * matches the Targeting.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value on_target_reach = 1;</code>
   * @return The onTargetReach.
   */
  com.google.protobuf.Int64Value getOnTargetReach();
  /**
   * <pre>
   * Number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency times that exactly
   * matches the Targeting.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value on_target_reach = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getOnTargetReachOrBuilder();

  /**
   * <pre>
   * Total number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency times. This includes
   * people that may fall outside the specified Targeting.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value total_reach = 2;</code>
   * @return Whether the totalReach field is set.
   */
  boolean hasTotalReach();
  /**
   * <pre>
   * Total number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency times. This includes
   * people that may fall outside the specified Targeting.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value total_reach = 2;</code>
   * @return The totalReach.
   */
  com.google.protobuf.Int64Value getTotalReach();
  /**
   * <pre>
   * Total number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency times. This includes
   * people that may fall outside the specified Targeting.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value total_reach = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTotalReachOrBuilder();

  /**
   * <pre>
   * Number of ad impressions that exactly matches the Targeting.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value on_target_impressions = 3;</code>
   * @return Whether the onTargetImpressions field is set.
   */
  boolean hasOnTargetImpressions();
  /**
   * <pre>
   * Number of ad impressions that exactly matches the Targeting.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value on_target_impressions = 3;</code>
   * @return The onTargetImpressions.
   */
  com.google.protobuf.Int64Value getOnTargetImpressions();
  /**
   * <pre>
   * Number of ad impressions that exactly matches the Targeting.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value on_target_impressions = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getOnTargetImpressionsOrBuilder();

  /**
   * <pre>
   * Total number of ad impressions. This includes impressions that may fall
   * outside the specified Targeting, due to insufficient information on
   * signed-in users.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value total_impressions = 4;</code>
   * @return Whether the totalImpressions field is set.
   */
  boolean hasTotalImpressions();
  /**
   * <pre>
   * Total number of ad impressions. This includes impressions that may fall
   * outside the specified Targeting, due to insufficient information on
   * signed-in users.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value total_impressions = 4;</code>
   * @return The totalImpressions.
   */
  com.google.protobuf.Int64Value getTotalImpressions();
  /**
   * <pre>
   * Total number of ad impressions. This includes impressions that may fall
   * outside the specified Targeting, due to insufficient information on
   * signed-in users.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value total_impressions = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTotalImpressionsOrBuilder();
}
