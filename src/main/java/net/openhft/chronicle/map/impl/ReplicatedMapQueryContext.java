/*
 * Copyright 2012-2018 Chronicle Map Contributors
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

package net.openhft.chronicle.map.impl;

import net.openhft.chronicle.hash.impl.stage.data.bytes.EntryKeyBytesData;
import net.openhft.chronicle.hash.impl.stage.data.bytes.InputKeyBytesData;
import net.openhft.chronicle.hash.impl.stage.entry.*;
import net.openhft.chronicle.hash.impl.stage.hash.KeyBytesInterop;
import net.openhft.chronicle.hash.impl.stage.hash.LogHolder;
import net.openhft.chronicle.hash.impl.stage.hash.OwnerThreadHolder;
import net.openhft.chronicle.hash.impl.stage.query.KeySearch;
import net.openhft.chronicle.hash.impl.stage.query.QueryHashLookupSearch;
import net.openhft.chronicle.hash.impl.stage.query.QuerySegmentStages;
import net.openhft.chronicle.hash.impl.stage.query.SearchAllocatedChunks;
import net.openhft.chronicle.map.impl.stage.data.DummyValueZeroData;
import net.openhft.chronicle.map.impl.stage.data.bytes.EntryValueBytesData;
import net.openhft.chronicle.map.impl.stage.data.bytes.WrappedValueBytesData;
import net.openhft.chronicle.map.impl.stage.data.instance.WrappedValueInstanceDataHolder;
import net.openhft.chronicle.map.impl.stage.entry.ReplicatedMapEntryStages;
import net.openhft.chronicle.map.impl.stage.input.ReplicatedInput;
import net.openhft.chronicle.map.impl.stage.map.*;
import net.openhft.chronicle.map.impl.stage.query.*;
import net.openhft.chronicle.map.impl.stage.replication.ReplicatedQueryAlloc;
import net.openhft.chronicle.map.impl.stage.replication.ReplicationUpdate;
import net.openhft.chronicle.map.impl.stage.ret.DefaultReturnValue;
import net.openhft.chronicle.map.impl.stage.ret.UsingReturnValue;
import net.openhft.sg.Context;
import net.openhft.sg.Staged;

@Staged
@Context(topLevel = {
        CompilationAnchor.class,
        OwnerThreadHolder.class,

        LogHolder.class,

        ReplicatedChronicleMapHolderImpl.class,

        KeyBytesInterop.class,
        QuerySegmentStages.class,
        KeySearch.class,
        InputKeyHashCode.class,
        QueryHashLookupSearch.class,
        HashLookupPos.class,

        QueryCheckOnEachPublicOperation.class,
        SearchAllocatedChunks.class,

        ReplicatedMapEntryStages.class,
        MapEntryOperationsDelegation.class,
        WrappedValueInstanceDataHolderAccess.class,
        WrappedValueBytesDataAccess.class,
        ReplicatedMapQuery.class,
        ReplicatedMapAbsent.class,
        DefaultValue.class,
        ValueBytesInterop.class,
        ReplicationUpdate.class,
        ReplicatedInput.class,

        ReplicatedQueryAlloc.class,
},
        nested = {
                ReadLock.class,
                UpdateLock.class,
                WriteLock.class,

                EntryKeyBytesData.class,
                EntryValueBytesData.class,

                InputKeyBytesData.class,

                WrappedValueInstanceDataHolder.class,
                WrappedValueBytesData.class,
                AcquireHandle.class,
                DefaultReturnValue.class,
                UsingReturnValue.class,

                ReplicatedMapAbsentDelegating.class,

                DummyValueZeroData.class,

                HashEntryChecksumStrategy.class,
        })
public class ReplicatedMapQueryContext {
}
