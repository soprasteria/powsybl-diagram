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
import com.powsybl.sld.util.IdUtil;

/**
 * @author Florian Dupuy {@literal <florian.dupuy at rte-france.com>}
 */
public class LegacyIdProvider implements IdProvider {

    private final String prefixId;

    public LegacyIdProvider(String prefixId) {
        this.prefixId = prefixId;
    }

    @Override
    public String createId(BranchEdge edge) {
        return IdUtil.escapeId(prefixId + edge.getId());
    }

    @Override
    public String createId(Node node) {
        return IdUtil.escapeId(prefixId + node.getId());
    }
}
