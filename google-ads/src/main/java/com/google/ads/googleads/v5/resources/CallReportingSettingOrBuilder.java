// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/customer.proto

package com.google.ads.googleads.v5.resources;

public interface CallReportingSettingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.resources.CallReportingSetting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Enable reporting of phone call events by redirecting them via Google
   * System.
   * </pre>
   *
   * <code>bool call_reporting_enabled = 10;</code>
   * @return Whether the callReportingEnabled field is set.
   */
  boolean hasCallReportingEnabled();
  /**
   * <pre>
   * Enable reporting of phone call events by redirecting them via Google
   * System.
   * </pre>
   *
   * <code>bool call_reporting_enabled = 10;</code>
   * @return The callReportingEnabled.
   */
  boolean getCallReportingEnabled();

  /**
   * <pre>
   * Whether to enable call conversion reporting.
   * </pre>
   *
   * <code>bool call_conversion_reporting_enabled = 11;</code>
   * @return Whether the callConversionReportingEnabled field is set.
   */
  boolean hasCallConversionReportingEnabled();
  /**
   * <pre>
   * Whether to enable call conversion reporting.
   * </pre>
   *
   * <code>bool call_conversion_reporting_enabled = 11;</code>
   * @return The callConversionReportingEnabled.
   */
  boolean getCallConversionReportingEnabled();

  /**
   * <pre>
   * Customer-level call conversion action to attribute a call conversion to.
   * If not set a default conversion action is used. Only in effect when
   * call_conversion_reporting_enabled is set to true.
   * </pre>
   *
   * <code>string call_conversion_action = 12 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the callConversionAction field is set.
   */
  boolean hasCallConversionAction();
  /**
   * <pre>
   * Customer-level call conversion action to attribute a call conversion to.
   * If not set a default conversion action is used. Only in effect when
   * call_conversion_reporting_enabled is set to true.
   * </pre>
   *
   * <code>string call_conversion_action = 12 [(.google.api.resource_reference) = { ... }</code>
   * @return The callConversionAction.
   */
  java.lang.String getCallConversionAction();
  /**
   * <pre>
   * Customer-level call conversion action to attribute a call conversion to.
   * If not set a default conversion action is used. Only in effect when
   * call_conversion_reporting_enabled is set to true.
   * </pre>
   *
   * <code>string call_conversion_action = 12 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for callConversionAction.
   */
  com.google.protobuf.ByteString
      getCallConversionActionBytes();
}
