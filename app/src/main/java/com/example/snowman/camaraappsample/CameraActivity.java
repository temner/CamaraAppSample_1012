/*
 * Copyright 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.snowman.camaraappsample;

import android.app.Activity;
import android.os.Bundle;

public class CameraActivity extends Activity {

    @Override
    // アクティビティの生成時に呼ばれる
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);



        if (null == savedInstanceState) {

            getFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance())    // FragmentをActivityに組み込む．第1引数はFragmentが入るViewのID、第2引数は挿入するFragment
                    .commit();                                                        // 変更を反映する．Fragmentのライフサイクルが機能し始める
        }
    }

}
