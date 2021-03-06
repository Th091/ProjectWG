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
 * on 2016-09-25 at 17:25:33 UTC 
 * Modify at your own risk.
 */

package com.wgappbackend.billendpoint;

/**
 * Service definition for Billendpoint (v1).
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
 * This service uses {@link BillendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Billendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.21.0 of the billendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "billendpoint/v1/";

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
  public Billendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Billendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getBill".
   *
   * This request holds the parameters needed by the billendpoint server.  After setting any optional
   * parameters, call the {@link GetBill#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetBill getBill(java.lang.Long id) throws java.io.IOException {
    GetBill result = new GetBill(id);
    initialize(result);
    return result;
  }

  public class GetBill extends BillendpointRequest<com.wgappbackend.billendpoint.model.Bill> {

    private static final String REST_PATH = "bill/{id}";

    /**
     * Create a request for the method "getBill".
     *
     * This request holds the parameters needed by the the billendpoint server.  After setting any
     * optional parameters, call the {@link GetBill#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetBill#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetBill(java.lang.Long id) {
      super(Billendpoint.this, "GET", REST_PATH, null, com.wgappbackend.billendpoint.model.Bill.class);
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
    public GetBill setAlt(java.lang.String alt) {
      return (GetBill) super.setAlt(alt);
    }

    @Override
    public GetBill setFields(java.lang.String fields) {
      return (GetBill) super.setFields(fields);
    }

    @Override
    public GetBill setKey(java.lang.String key) {
      return (GetBill) super.setKey(key);
    }

    @Override
    public GetBill setOauthToken(java.lang.String oauthToken) {
      return (GetBill) super.setOauthToken(oauthToken);
    }

    @Override
    public GetBill setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetBill) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetBill setQuotaUser(java.lang.String quotaUser) {
      return (GetBill) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetBill setUserIp(java.lang.String userIp) {
      return (GetBill) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetBill setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetBill set(String parameterName, Object value) {
      return (GetBill) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertBill".
   *
   * This request holds the parameters needed by the billendpoint server.  After setting any optional
   * parameters, call the {@link InsertBill#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.wgappbackend.billendpoint.model.Bill}
   * @return the request
   */
  public InsertBill insertBill(com.wgappbackend.billendpoint.model.Bill content) throws java.io.IOException {
    InsertBill result = new InsertBill(content);
    initialize(result);
    return result;
  }

  public class InsertBill extends BillendpointRequest<com.wgappbackend.billendpoint.model.Bill> {

    private static final String REST_PATH = "bill";

    /**
     * Create a request for the method "insertBill".
     *
     * This request holds the parameters needed by the the billendpoint server.  After setting any
     * optional parameters, call the {@link InsertBill#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertBill#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.wgappbackend.billendpoint.model.Bill}
     * @since 1.13
     */
    protected InsertBill(com.wgappbackend.billendpoint.model.Bill content) {
      super(Billendpoint.this, "POST", REST_PATH, content, com.wgappbackend.billendpoint.model.Bill.class);
    }

    @Override
    public InsertBill setAlt(java.lang.String alt) {
      return (InsertBill) super.setAlt(alt);
    }

    @Override
    public InsertBill setFields(java.lang.String fields) {
      return (InsertBill) super.setFields(fields);
    }

    @Override
    public InsertBill setKey(java.lang.String key) {
      return (InsertBill) super.setKey(key);
    }

    @Override
    public InsertBill setOauthToken(java.lang.String oauthToken) {
      return (InsertBill) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertBill setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertBill) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertBill setQuotaUser(java.lang.String quotaUser) {
      return (InsertBill) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertBill setUserIp(java.lang.String userIp) {
      return (InsertBill) super.setUserIp(userIp);
    }

    @Override
    public InsertBill set(String parameterName, Object value) {
      return (InsertBill) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listBill".
   *
   * This request holds the parameters needed by the billendpoint server.  After setting any optional
   * parameters, call the {@link ListBill#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListBill listBill() throws java.io.IOException {
    ListBill result = new ListBill();
    initialize(result);
    return result;
  }

  public class ListBill extends BillendpointRequest<com.wgappbackend.billendpoint.model.CollectionResponseBill> {

    private static final String REST_PATH = "bill";

    /**
     * Create a request for the method "listBill".
     *
     * This request holds the parameters needed by the the billendpoint server.  After setting any
     * optional parameters, call the {@link ListBill#execute()} method to invoke the remote operation.
     * <p> {@link
     * ListBill#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListBill() {
      super(Billendpoint.this, "GET", REST_PATH, null, com.wgappbackend.billendpoint.model.CollectionResponseBill.class);
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
    public ListBill setAlt(java.lang.String alt) {
      return (ListBill) super.setAlt(alt);
    }

    @Override
    public ListBill setFields(java.lang.String fields) {
      return (ListBill) super.setFields(fields);
    }

    @Override
    public ListBill setKey(java.lang.String key) {
      return (ListBill) super.setKey(key);
    }

    @Override
    public ListBill setOauthToken(java.lang.String oauthToken) {
      return (ListBill) super.setOauthToken(oauthToken);
    }

    @Override
    public ListBill setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListBill) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListBill setQuotaUser(java.lang.String quotaUser) {
      return (ListBill) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListBill setUserIp(java.lang.String userIp) {
      return (ListBill) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListBill setCursor(java.lang.String cursor) {
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

    public ListBill setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListBill set(String parameterName, Object value) {
      return (ListBill) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeBill".
   *
   * This request holds the parameters needed by the billendpoint server.  After setting any optional
   * parameters, call the {@link RemoveBill#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public RemoveBill removeBill(java.lang.Long id) throws java.io.IOException {
    RemoveBill result = new RemoveBill(id);
    initialize(result);
    return result;
  }

  public class RemoveBill extends BillendpointRequest<Void> {

    private static final String REST_PATH = "bill/{id}";

    /**
     * Create a request for the method "removeBill".
     *
     * This request holds the parameters needed by the the billendpoint server.  After setting any
     * optional parameters, call the {@link RemoveBill#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemoveBill#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveBill(java.lang.Long id) {
      super(Billendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveBill setAlt(java.lang.String alt) {
      return (RemoveBill) super.setAlt(alt);
    }

    @Override
    public RemoveBill setFields(java.lang.String fields) {
      return (RemoveBill) super.setFields(fields);
    }

    @Override
    public RemoveBill setKey(java.lang.String key) {
      return (RemoveBill) super.setKey(key);
    }

    @Override
    public RemoveBill setOauthToken(java.lang.String oauthToken) {
      return (RemoveBill) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveBill setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveBill) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveBill setQuotaUser(java.lang.String quotaUser) {
      return (RemoveBill) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveBill setUserIp(java.lang.String userIp) {
      return (RemoveBill) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveBill setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveBill set(String parameterName, Object value) {
      return (RemoveBill) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateBill".
   *
   * This request holds the parameters needed by the billendpoint server.  After setting any optional
   * parameters, call the {@link UpdateBill#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.wgappbackend.billendpoint.model.Bill}
   * @return the request
   */
  public UpdateBill updateBill(com.wgappbackend.billendpoint.model.Bill content) throws java.io.IOException {
    UpdateBill result = new UpdateBill(content);
    initialize(result);
    return result;
  }

  public class UpdateBill extends BillendpointRequest<com.wgappbackend.billendpoint.model.Bill> {

    private static final String REST_PATH = "bill";

    /**
     * Create a request for the method "updateBill".
     *
     * This request holds the parameters needed by the the billendpoint server.  After setting any
     * optional parameters, call the {@link UpdateBill#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateBill#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.wgappbackend.billendpoint.model.Bill}
     * @since 1.13
     */
    protected UpdateBill(com.wgappbackend.billendpoint.model.Bill content) {
      super(Billendpoint.this, "PUT", REST_PATH, content, com.wgappbackend.billendpoint.model.Bill.class);
    }

    @Override
    public UpdateBill setAlt(java.lang.String alt) {
      return (UpdateBill) super.setAlt(alt);
    }

    @Override
    public UpdateBill setFields(java.lang.String fields) {
      return (UpdateBill) super.setFields(fields);
    }

    @Override
    public UpdateBill setKey(java.lang.String key) {
      return (UpdateBill) super.setKey(key);
    }

    @Override
    public UpdateBill setOauthToken(java.lang.String oauthToken) {
      return (UpdateBill) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateBill setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateBill) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateBill setQuotaUser(java.lang.String quotaUser) {
      return (UpdateBill) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateBill setUserIp(java.lang.String userIp) {
      return (UpdateBill) super.setUserIp(userIp);
    }

    @Override
    public UpdateBill set(String parameterName, Object value) {
      return (UpdateBill) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Billendpoint}.
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

    /** Builds a new instance of {@link Billendpoint}. */
    @Override
    public Billendpoint build() {
      return new Billendpoint(this);
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
     * Set the {@link BillendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setBillendpointRequestInitializer(
        BillendpointRequestInitializer billendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(billendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
