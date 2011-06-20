/*
 * Copyright (c) 2011 Google Inc.
 *
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

package com.google.api.client.sample.buzz.appengine.oauth2;

/**
 * OAuth 2.0 credentials found in the <a href="https://code.google.com/apis/console">Google APIs
 * Console</a>.
 *
 * <p>
 * Once at the Google APIs Console, click on "Add project...", or if you've already set up a
 * project, click the arrow next to the project name and click on "Create..." under "Other
 * projects". For "Buzz API", click on the status switch to flip it to "ON", and agree to the terms
 * of service. Next, click on "API Access". Click on "Create an OAuth 2.0 Client ID...". Select a
 * product name and click "Next". Make sure you select "Installed application" and click "Create
 * client ID".
 * </p>
 *
 * @author Yaniv Inbar
 */
class OAuth2ClientCredentials {

  /** Value of the "Client ID" shown under "Client ID for installed applications". */
  static final String CLIENT_ID = "28040055140.apps.googleusercontent.com";

  /** Value of the "Client secret" shown under "Client ID for installed applications". */
  static final String CLIENT_SECRET = "vc1yjuXxCeELm+T+o6y+nL0F";

  /** OAuth 2 scope to use (may also append {@code ".readonly"} for the read-only scope). */
  static final String SCOPE = "https://www.googleapis.com/auth/buzz";
}