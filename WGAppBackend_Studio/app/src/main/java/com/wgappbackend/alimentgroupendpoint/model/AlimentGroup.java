/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-07-08 17:28:43 UTC)
 * on 2016-09-25 at 17:25:13 UTC 
 * Modify at your own risk.
 */

package com.wgappbackend.alimentgroupendpoint.model;

/**
 * Model definition for AlimentGroup.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the alimentgroupendpoint. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AlimentGroup extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Aliment> alimentList;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Resident> attributedResident;

  static {
    // hack to force ProGuard to consider Resident used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Resident.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer communeId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer id;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Aliment> getAlimentList() {
    return alimentList;
  }

  /**
   * @param alimentList alimentList or {@code null} for none
   */
  public AlimentGroup setAlimentList(java.util.List<Aliment> alimentList) {
    this.alimentList = alimentList;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Resident> getAttributedResident() {
    return attributedResident;
  }

  /**
   * @param attributedResident attributedResident or {@code null} for none
   */
  public AlimentGroup setAttributedResident(java.util.List<Resident> attributedResident) {
    this.attributedResident = attributedResident;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCommuneId() {
    return communeId;
  }

  /**
   * @param communeId communeId or {@code null} for none
   */
  public AlimentGroup setCommuneId(java.lang.Integer communeId) {
    this.communeId = communeId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public AlimentGroup setId(java.lang.Integer id) {
    this.id = id;
    return this;
  }

  @Override
  public AlimentGroup set(String fieldName, Object value) {
    return (AlimentGroup) super.set(fieldName, value);
  }

  @Override
  public AlimentGroup clone() {
    return (AlimentGroup) super.clone();
  }

}