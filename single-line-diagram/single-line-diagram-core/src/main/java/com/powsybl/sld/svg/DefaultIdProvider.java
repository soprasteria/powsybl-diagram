/*
 * Copyright (c) 2026, RTE (http://www.rte-france.com)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * SPDX-License-Identifier: MPL-2.0
 */
package com.powsybl.sld.svg;

import com.powsybl.sld.model.nodes.BranchEdge;
import com.powsybl.sld.model.nodes.Node;

/**
 * @author Florian Dupuy {@literal <florian.dupuy at rte-france.com>}
 */
public class DefaultIdProvider implements IdProvider {

    private final String prefixId;
    private int count;

    public DefaultIdProvider(String prefixId) {
        this.prefixId = prefixId;
        this.count = 0;
    }

    @Override
    public String createId(BranchEdge edge) {
        return prefixId + count++;
    }

    @Override
    public String createId(Node node) {
        return prefixId + count++;
    }
}
