// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/geo_target_constant_service.proto

package com.google.ads.googleads.v5.services;

public interface SuggestGeoTargetConstantsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.services.SuggestGeoTargetConstantsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If possible, returned geo targets are translated using this locale. If not,
   * en is used by default. This is also used as a hint for returned geo
   * targets.
   * </pre>
   *
   * <code>string locale = 6;</code>
   * @return Whether the locale field is set.
   */
  boolean hasLocale();
  /**
   * <pre>
   * If possible, returned geo targets are translated using this locale. If not,
   * en is used by default. This is also used as a hint for returned geo
   * targets.
   * </pre>
   *
   * <code>string locale = 6;</code>
   * @return The locale.
   */
  java.lang.String getLocale();
  /**
   * <pre>
   * If possible, returned geo targets are translated using this locale. If not,
   * en is used by default. This is also used as a hint for returned geo
   * targets.
   * </pre>
   *
   * <code>string locale = 6;</code>
   * @return The bytes for locale.
   */
  com.google.protobuf.ByteString
      getLocaleBytes();

  /**
   * <pre>
   * Returned geo targets are restricted to this country code.
   * </pre>
   *
   * <code>string country_code = 7;</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * Returned geo targets are restricted to this country code.
   * </pre>
   *
   * <code>string country_code = 7;</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * Returned geo targets are restricted to this country code.
   * </pre>
   *
   * <code>string country_code = 7;</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * The location names to search by. At most 25 names can be set.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.SuggestGeoTargetConstantsRequest.LocationNames location_names = 1;</code>
   * @return Whether the locationNames field is set.
   */
  boolean hasLocationNames();
  /**
   * <pre>
   * The location names to search by. At most 25 names can be set.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.SuggestGeoTargetConstantsRequest.LocationNames location_names = 1;</code>
   * @return The locationNames.
   */
  com.google.ads.googleads.v5.services.SuggestGeoTargetConstantsRequest.LocationNames getLocationNames();
  /**
   * <pre>
   * The location names to search by. At most 25 names can be set.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.SuggestGeoTargetConstantsRequest.LocationNames location_names = 1;</code>
   */
  com.google.ads.googleads.v5.services.SuggestGeoTargetConstantsRequest.LocationNamesOrBuilder getLocationNamesOrBuilder();

  /**
   * <pre>
   * The geo target constant resource names to filter by.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.SuggestGeoTargetConstantsRequest.GeoTargets geo_targets = 2;</code>
   * @return Whether the geoTargets field is set.
   */
  boolean hasGeoTargets();
  /**
   * <pre>
   * The geo target constant resource names to filter by.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.SuggestGeoTargetConstantsRequest.GeoTargets geo_targets = 2;</code>
   * @return The geoTargets.
   */
  com.google.ads.googleads.v5.services.SuggestGeoTargetConstantsRequest.GeoTargets getGeoTargets();
  /**
   * <pre>
   * The geo target constant resource names to filter by.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.SuggestGeoTargetConstantsRequest.GeoTargets geo_targets = 2;</code>
   */
  com.google.ads.googleads.v5.services.SuggestGeoTargetConstantsRequest.GeoTargetsOrBuilder getGeoTargetsOrBuilder();

  public com.google.ads.googleads.v5.services.SuggestGeoTargetConstantsRequest.QueryCase getQueryCase();
}
