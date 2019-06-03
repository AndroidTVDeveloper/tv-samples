/*
 * Copyright (C) 2017 The Android Open Source Project
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

package android.support.v17.leanback.supportleanbackshowcase.app.room.di.androidinjectorannotation;

import android.support.v17.leanback.supportleanbackshowcase.app.room.controller.overview.LiveDataFragment;
import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = LiveDataOverviewFragmentSubComponent.class)
public abstract class FragmentBuildersModule {

    @Binds
    @IntoMap
    @FragmentKey(LiveDataFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindFragmentInjectorFactory(
            LiveDataOverviewFragmentSubComponent.Builder builder);
}