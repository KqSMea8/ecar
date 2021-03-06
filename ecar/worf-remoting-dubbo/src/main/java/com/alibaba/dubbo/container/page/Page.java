/*
 * Copyright 1999-2011 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.container.page;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Page
 *
 * @author william.liangf
 */
public class Page {

    private final String navigation;

    private final String title;

    private final List<String> columns;

    private final List<List<String>> rows;

    public Page(final String navigation) {
        this(navigation, (String) null, (String[]) null, (List<List<String>>) null);
    }

    public Page(final String navigation, final String title, final String column, final String row) {
        this(navigation, title, column == null ? null : Arrays.asList(new String[] { column }), row == null ? null
                : stringToList(row));
    }

    private static List<List<String>> stringToList(final String str) {
        List<List<String>> rows = new ArrayList<List<String>>();
        List<String> row = new ArrayList<String>();
        row.add(str);
        rows.add(row);
        return rows;
    }

    public Page(final String navigation, final String title, final String[] columns, final List<List<String>> rows) {
        this(navigation, title, columns == null ? null : Arrays.asList(columns), rows);
    }

    public Page(final String navigation, final String title, final List<String> columns, final List<List<String>> rows) {
        this.navigation = navigation;
        this.title = title;
        this.columns = columns;
        this.rows = rows;
    }

    public String getNavigation() {
        return navigation;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getColumns() {
        return columns;
    }

    public List<List<String>> getRows() {
        return rows;
    }

}