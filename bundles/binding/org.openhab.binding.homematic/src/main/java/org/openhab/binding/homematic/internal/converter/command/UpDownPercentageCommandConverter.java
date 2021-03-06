/**
 * Copyright (c) 2010-2013, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.homematic.internal.converter.command;

import org.openhab.core.library.types.PercentType;
import org.openhab.core.library.types.UpDownType;
import org.openhab.core.types.State;

/**
 * Converts an {@link PercentType} to an OnOffValue. Only a value of 100 is converted to ON. Other values to OFF.
 * 
 * @author Thomas Letsch (contact@thomas-letsch.de)
 * 
 */
public class UpDownPercentageCommandConverter extends CommandConverter<PercentType, UpDownType> {

    private static final int MAX_VALUE = 100;
    private static final int MIN_VALUE = 0;

    @Override
    protected PercentType convertImpl(State actualState, UpDownType command) {
        return new PercentType(command.equals(UpDownType.UP) ? MAX_VALUE : MIN_VALUE);
    }

}
