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
 * on 2016-09-25 at 17:25:05 UTC 
 * Modify at your own risk.
 */

package com.wgappbackend.plannedeventendpoint.model;

/**
 * Model definition for Resident.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the plannedeventendpoint. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Resident extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String emailAddress;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime enterDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> groupAliment;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneNumber;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object visitCard;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> weekTasks;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer wgId;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEmailAddress() {
    return emailAddress;
  }

  /**
   * @param emailAddress emailAddress or {@code null} for none
   */
  public Resident setEmailAddress(java.lang.String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getEnterDate() {
    return enterDate;
  }

  /**
   * @param enterDate enterDate or {@code null} for none
   */
  public Resident setEnterDate(com.google.api.client.util.DateTime enterDate) {
    this.enterDate = enterDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getGroupAliment() {
    return groupAliment;
  }

  /**
   * @param groupAliment groupAliment or {@code null} for none
   */
  public Resident setGroupAliment(java.util.List<java.lang.Integer> groupAliment) {
    this.groupAliment = groupAliment;
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
  public Resident setId(java.lang.Integer id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public Resident setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * @param phoneNumber phoneNumber or {@code null} for none
   */
  public Resident setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getVisitCard() {
    return visitCard;
  }

  /**
   * @param visitCard visitCard or {@code null} for none
   */
  public Resident setVisitCard(java.lang.Object visitCard) {
    this.visitCard = visitCard;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getWeekTasks() {
    return weekTasks;
  }

  /**
   * @param weekTasks weekTasks or {@code null} for none
   */
  public Resident setWeekTasks(java.util.List<java.lang.Integer> weekTasks) {
    this.weekTasks = weekTasks;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWgId() {
    return wgId;
  }

  /**
   * @param wgId wgId or {@code null} for none
   */
  public Resident setWgId(java.lang.Integer wgId) {
    this.wgId = wgId;
    return this;
  }

  @Override
  public Resident set(String fieldName, Object value) {
    return (Resident) super.set(fieldName, value);
  }

  @Override
  public Resident clone() {
    return (Resident) super.clone();
  }

}
