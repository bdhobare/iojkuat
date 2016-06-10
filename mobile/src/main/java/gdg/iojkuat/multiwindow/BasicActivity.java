/*
 * Copyright (C) 2016 The Android Open Source Project
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

package gdg.iojkuat.multiwindow;



import android.os.Bundle;
import android.view.View;

import gdg.iojkuat.R;

/**
 * This activity is the most basic, simeple use case and is to be launched without any special
 * flags
 * or settings.
 *
 */
public class BasicActivity extends ParentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);

        // Set the color and description
        setDescription(R.string.activity_description_basic);
        setBackgroundColor(R.color.gray);

    }
}
