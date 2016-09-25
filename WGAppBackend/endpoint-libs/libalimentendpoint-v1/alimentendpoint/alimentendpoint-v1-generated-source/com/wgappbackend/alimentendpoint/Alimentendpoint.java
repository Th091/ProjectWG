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
 * on 2016-09-25 at 17:26:18 UTC 
 * Modify at your own risk.
 */

package com.wgappbackend.alimentendpoint;

/**
 * Service definition for Alimentendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link AlimentendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Alimentendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.21.0 of the alimentendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myapp.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "alimentendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Alimentendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Alimentendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getAliment".
   *
   * This request holds the parameters needed by the alimentendpoint server.  After setting any
   * optional parameters, call the {@link GetAliment#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetAliment getAliment(java.lang.Long id) throws java.io.IOException {
    GetAliment result = new GetAliment(id);
    initialize(result);
    return result;
  }

  public class GetAliment extends AlimentendpointRequest<com.wgappbackend.alimentendpoint.model.Aliment> {

    private static final String REST_PATH = "aliment/{id}";

    /**
     * Create a request for the method "getAliment".
     *
     * This request holds the parameters needed by the the alimentendpoint server.  After setting any
     * optional parameters, call the {@link GetAliment#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetAliment#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetAliment(java.lang.Long id) {
      super(Alimentendpoint.this, "GET", REST_PATH, null, com.wgappbackend.alimentendpoint.model.Aliment.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetAliment setAlt(java.lang.String alt) {
      return (GetAliment) super.setAlt(alt);
    }

    @Override
    public GetAliment setFields(java.lang.String fields) {
      return (GetAliment) super.setFields(fields);
    }

    @Override
    public GetAliment setKey(java.lang.String key) {
      return (GetAliment) super.setKey(key);
    }

    @Override
    public GetAliment setOauthToken(java.lang.String oauthToken) {
      return (GetAliment) super.setOauthToken(oauthToken);
    }

    @Override
    public GetAliment setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetAliment) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetAliment setQuotaUser(java.lang.String quotaUser) {
      return (GetAliment) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetAliment setUserIp(java.lang.String userIp) {
      return (GetAliment) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetAliment setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetAliment set(String parameterName, Object value) {
      return (GetAliment) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertAliment".
   *
   * This request holds the parameters needed by the alimentendpoint server.  After setting any
   * optional parameters, call the {@link InsertAliment#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.wgappbackend.alimentendpoint.model.Aliment}
   * @return the request
   */
  public InsertAliment insertAliment(com.wgappbackend.alimentendpoint.model.Aliment content) throws java.io.IOException {
    InsertAliment result = new InsertAliment(content);
    initialize(result);
    return result;
  }

  public class InsertAliment extends AlimentendpointRequest<com.wgappbackend.alimentendpoint.model.Aliment> {

    private static final String REST_PATH = "aliment";

    /**
     * Create a request for the method "insertAliment".
     *
     * This request holds the parameters needed by the the alimentendpoint server.  After setting any
     * optional parameters, call the {@link InsertAliment#execute()} method to invoke the remote
     * operation. <p> {@link InsertAliment#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.wgappbackend.alimentendpoint.model.Aliment}
     * @since 1.13
     */
    protected InsertAliment(com.wgappbackend.alimentendpoint.model.Aliment content) {
      super(Alimentendpoint.this, "POST", REST_PATH, content, com.wgappbackend.alimentendpoint.model.Aliment.class);
    }

    @Override
    public InsertAliment setAlt(java.lang.String alt) {
      return (InsertAliment) super.setAlt(alt);
    }

    @Override
    public InsertAliment setFields(java.lang.String fields) {
      return (InsertAliment) super.setFields(fields);
    }

    @Override
    public InsertAliment setKey(java.lang.String key) {
      return (InsertAliment) super.setKey(key);
    }

    @Override
    public InsertAliment setOauthToken(java.lang.String oauthToken) {
      return (InsertAliment) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertAliment setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertAliment) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertAliment setQuotaUser(java.lang.String quotaUser) {
      return (InsertAliment) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertAliment setUserIp(java.lang.String userIp) {
      return (InsertAliment) super.setUserIp(userIp);
    }

    @Override
    public InsertAliment set(String parameterName, Object value) {
      return (InsertAliment) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listAliment".
   *
   * This request holds the parameters needed by the alimentendpoint server.  After setting any
   * optional parameters, call the {@link ListAliment#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListAliment listAliment() throws java.io.IOException {
    ListAliment result = new ListAliment();
    initialize(result);
    return result;
  }

  public class ListAliment extends AlimentendpointRequest<com.wgappbackend.alimentendpoint.model.CollectionResponseAliment> {

    private static final String REST_PATH = "aliment";

    /**
     * Create a request for the method "listAliment".
     *
     * This request holds the parameters needed by the the alimentendpoint server.  After setting any
     * optional parameters, call the {@link ListAliment#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListAliment#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListAliment() {
      super(Alimentendpoint.this, "GET", REST_PATH, null, com.wgappbackend.alimentendpoint.model.CollectionResponseAliment.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListAliment setAlt(java.lang.String alt) {
      return (ListAliment) super.setAlt(alt);
    }

    @Override
    public ListAliment setFields(java.lang.String fields) {
      return (ListAliment) super.setFields(fields);
    }

    @Override
    public ListAliment setKey(java.lang.String key) {
      return (ListAliment) super.setKey(key);
    }

    @Override
    public ListAliment setOauthToken(java.lang.String oauthToken) {
      return (ListAliment) super.setOauthToken(oauthToken);
    }

    @Override
    public ListAliment setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListAliment) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListAliment setQuotaUser(java.lang.String quotaUser) {
      return (ListAliment) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListAliment setUserIp(java.lang.String userIp) {
      return (ListAliment) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListAliment setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListAliment setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListAliment set(String parameterName, Object value) {
      return (ListAliment) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeAliment".
   *
   * This request holds the parameters needed by the alimentendpoint server.  After setting any
   * optional parameters, call the {@link RemoveAliment#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveAliment removeAliment(java.lang.Long id) throws java.io.IOException {
    RemoveAliment result = new RemoveAliment(id);
    initialize(result);
    return result;
  }

  public class RemoveAliment extends AlimentendpointRequest<Void> {

    private static final String REST_PATH = "aliment/{id}";

    /**
     * Create a request for the method "removeAliment".
     *
     * This request holds the parameters needed by the the alimentendpoint server.  After setting any
     * optional parameters, call the {@link RemoveAliment#execute()} method to invoke the remote
     * operation. <p> {@link RemoveAliment#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveAliment(java.lang.Long id) {
      super(Alimentendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveAliment setAlt(java.lang.String alt) {
      return (RemoveAliment) super.setAlt(alt);
    }

    @Override
    public RemoveAliment setFields(java.lang.String fields) {
      return (RemoveAliment) super.setFields(fields);
    }

    @Override
    public RemoveAliment setKey(java.lang.String key) {
      return (RemoveAliment) super.setKey(key);
    }

    @Override
    public RemoveAliment setOauthToken(java.lang.String oauthToken) {
      return (RemoveAliment) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveAliment setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveAliment) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveAliment setQuotaUser(java.lang.String quotaUser) {
      return (RemoveAliment) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveAliment setUserIp(java.lang.String userIp) {
      return (RemoveAliment) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveAliment setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveAliment set(String parameterName, Object value) {
      return (RemoveAliment) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateAliment".
   *
   * This request holds the parameters needed by the alimentendpoint server.  After setting any
   * optional parameters, call the {@link UpdateAliment#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.wgappbackend.alimentendpoint.model.Aliment}
   * @return the request
   */
  public UpdateAliment updateAliment(com.wgappbackend.alimentendpoint.model.Aliment content) throws java.io.IOException {
    UpdateAliment result = new UpdateAliment(content);
    initialize(result);
    return result;
  }

  public class UpdateAliment extends AlimentendpointRequest<com.wgappbackend.alimentendpoint.model.Aliment> {

    private static final String REST_PATH = "aliment";

    /**
     * Create a request for the method "updateAliment".
     *
     * This request holds the parameters needed by the the alimentendpoint server.  After setting any
     * optional parameters, call the {@link UpdateAliment#execute()} method to invoke the remote
     * operation. <p> {@link UpdateAliment#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.wgappbackend.alimentendpoint.model.Aliment}
     * @since 1.13
     */
    protected UpdateAliment(com.wgappbackend.alimentendpoint.model.Aliment content) {
      super(Alimentendpoint.this, "PUT", REST_PATH, content, com.wgappbackend.alimentendpoint.model.Aliment.class);
    }

    @Override
    public UpdateAliment setAlt(java.lang.String alt) {
      return (UpdateAliment) super.setAlt(alt);
    }

    @Override
    public UpdateAliment setFields(java.lang.String fields) {
      return (UpdateAliment) super.setFields(fields);
    }

    @Override
    public UpdateAliment setKey(java.lang.String key) {
      return (UpdateAliment) super.setKey(key);
    }

    @Override
    public UpdateAliment setOauthToken(java.lang.String oauthToken) {
      return (UpdateAliment) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateAliment setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateAliment) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateAliment setQuotaUser(java.lang.String quotaUser) {
      return (UpdateAliment) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateAliment setUserIp(java.lang.String userIp) {
      return (UpdateAliment) super.setUserIp(userIp);
    }

    @Override
    public UpdateAliment set(String parameterName, Object value) {
      return (UpdateAliment) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Alimentendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Alimentendpoint}. */
    @Override
    public Alimentendpoint build() {
      return new Alimentendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link AlimentendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setAlimentendpointRequestInitializer(
        AlimentendpointRequestInitializer alimentendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(alimentendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
