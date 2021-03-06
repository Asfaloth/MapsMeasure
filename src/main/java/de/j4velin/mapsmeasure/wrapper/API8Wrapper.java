/*
 * Copyright 2014 Thomas Hoffmann
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
package de.j4velin.mapsmeasure.wrapper;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

import java.io.File;

@TargetApi(Build.VERSION_CODES.FROYO)
public class API8Wrapper {

	private API8Wrapper() {
	}

	public static File getExternalFilesDir(final Context c) {
		return c.getExternalFilesDir(null);
	}

}
