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
 * on 2016-09-25 at 17:25:39 UTC 
 * Modify at your own risk.
 */

package com.wgappbackend.communeendpoint.model;

/**
 * Model definition for Commune.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the communeendpoint. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Commune extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AlimentGroup> alimentGroup;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Manager manager;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Resident> residents;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Task> tasks;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<AlimentGroup> getAlimentGroup() {
    return alimentGroup;
  }

  /**
   * @param alimentGroup alimentGroup or {@code null} for none
   */
  public Commune setAlimentGroup(java.util.List<AlimentGroup> alimentGroup) {
    this.alimentGroup = alimentGroup;
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
  public Commune setId(java.lang.Integer id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Manager getManager() {
    return manager;
  }

  /**
   * @param manager manager or {@code null} for none
   */
  public Commune setManager(Manager manager) {
    this.manager = manager;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Resident> getResidents() {
    return residents;
  }

  /**
   * @param residents residents or {@code null} for none
   */
  public Commune setResidents(java.util.List<Resident> residents) {
    this.residents = residents;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Task> getTasks() {
    return tasks;
  }

  /**
   * @param tasks tasks or {@code null} for none
   */
  public Commune setTasks(java.util.List<Task> tasks) {
    this.tasks = tasks;
    return this;
  }

  @Override
  public Commune set(String fieldName, Object value) {
    return (Commune) super.set(fieldName, value);
  }

  @Override
  public Commune clone() {
    return (Commune) super.clone();
  }

}
