// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/offline_user_data.proto

package com.google.ads.googleads.v4.common;

public interface UserIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.common.UserIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Hashed email address using SHA-256 hash function after normalization.
   * </pre>
   *
   * <code>.google.protobuf.StringValue hashed_email = 1;</code>
   * @return Whether the hashedEmail field is set.
   */
  boolean hasHashedEmail();
  /**
   * <pre>
   * Hashed email address using SHA-256 hash function after normalization.
   * </pre>
   *
   * <code>.google.protobuf.StringValue hashed_email = 1;</code>
   * @return The hashedEmail.
   */
  com.google.protobuf.StringValue getHashedEmail();
  /**
   * <pre>
   * Hashed email address using SHA-256 hash function after normalization.
   * </pre>
   *
   * <code>.google.protobuf.StringValue hashed_email = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getHashedEmailOrBuilder();

  /**
   * <pre>
   * Hashed phone number using SHA-256 hash function after normalization
   * (E164 standard).
   * </pre>
   *
   * <code>.google.protobuf.StringValue hashed_phone_number = 2;</code>
   * @return Whether the hashedPhoneNumber field is set.
   */
  boolean hasHashedPhoneNumber();
  /**
   * <pre>
   * Hashed phone number using SHA-256 hash function after normalization
   * (E164 standard).
   * </pre>
   *
   * <code>.google.protobuf.StringValue hashed_phone_number = 2;</code>
   * @return The hashedPhoneNumber.
   */
  com.google.protobuf.StringValue getHashedPhoneNumber();
  /**
   * <pre>
   * Hashed phone number using SHA-256 hash function after normalization
   * (E164 standard).
   * </pre>
   *
   * <code>.google.protobuf.StringValue hashed_phone_number = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getHashedPhoneNumberOrBuilder();

  /**
   * <pre>
   * Mobile device ID (advertising ID/IDFA).
   * </pre>
   *
   * <code>.google.protobuf.StringValue mobile_id = 3;</code>
   * @return Whether the mobileId field is set.
   */
  boolean hasMobileId();
  /**
   * <pre>
   * Mobile device ID (advertising ID/IDFA).
   * </pre>
   *
   * <code>.google.protobuf.StringValue mobile_id = 3;</code>
   * @return The mobileId.
   */
  com.google.protobuf.StringValue getMobileId();
  /**
   * <pre>
   * Mobile device ID (advertising ID/IDFA).
   * </pre>
   *
   * <code>.google.protobuf.StringValue mobile_id = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getMobileIdOrBuilder();

  /**
   * <pre>
   * Advertiser-assigned user ID for Customer Match upload, or
   * third-party-assigned user ID for SSD.
   * </pre>
   *
   * <code>.google.protobuf.StringValue third_party_user_id = 4;</code>
   * @return Whether the thirdPartyUserId field is set.
   */
  boolean hasThirdPartyUserId();
  /**
   * <pre>
   * Advertiser-assigned user ID for Customer Match upload, or
   * third-party-assigned user ID for SSD.
   * </pre>
   *
   * <code>.google.protobuf.StringValue third_party_user_id = 4;</code>
   * @return The thirdPartyUserId.
   */
  com.google.protobuf.StringValue getThirdPartyUserId();
  /**
   * <pre>
   * Advertiser-assigned user ID for Customer Match upload, or
   * third-party-assigned user ID for SSD.
   * </pre>
   *
   * <code>.google.protobuf.StringValue third_party_user_id = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getThirdPartyUserIdOrBuilder();

  /**
   * <pre>
   * Address information.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.common.OfflineUserAddressInfo address_info = 5;</code>
   * @return Whether the addressInfo field is set.
   */
  boolean hasAddressInfo();
  /**
   * <pre>
   * Address information.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.common.OfflineUserAddressInfo address_info = 5;</code>
   * @return The addressInfo.
   */
  com.google.ads.googleads.v4.common.OfflineUserAddressInfo getAddressInfo();
  /**
   * <pre>
   * Address information.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.common.OfflineUserAddressInfo address_info = 5;</code>
   */
  com.google.ads.googleads.v4.common.OfflineUserAddressInfoOrBuilder getAddressInfoOrBuilder();

  public com.google.ads.googleads.v4.common.UserIdentifier.IdentifierCase getIdentifierCase();
}
