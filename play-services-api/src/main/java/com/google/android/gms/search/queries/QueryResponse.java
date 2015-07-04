/*
 * Copyright 2013-2015 µg Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.gms.search.queries;

import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.common.api.Status;

import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParceled;

public class QueryResponse extends AutoSafeParcelable {

    @SafeParceled(1000)
    public final int versionCode;

    @SafeParceled(1)
    public final Status status;

    @SafeParceled(2)
    public final SearchResults results;

    private QueryResponse() {
        versionCode = 1;
        status = null;
        results = null;
    }

    public QueryResponse(Status status, SearchResults results) {
        this.versionCode = 1;
        this.status = status;
        this.results = results;
    }

    public static Creator<QueryResponse> CREATOR = new AutoCreator<QueryResponse>(QueryResponse.class);
}