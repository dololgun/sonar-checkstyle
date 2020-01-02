////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code for adherence to a set of rules.
// Copyright (C) 2001-2020 the original author or authors.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 3 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
////////////////////////////////////////////////////////////////////////////////

package org.sonar.plugins.checkstyle;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CheckstyleVersionTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void getCheckstyleVersion() {
        final String version = CheckstyleExecutor.PROPERTIES_PATH;
        assertThat(new CheckstyleVersion().getVersion(version).length()).isGreaterThan(1);
    }

    @Test
    public void getCheckstyleVersionException() {
        final String version = "/org/sonar/plugins/checkstyle/bad-checkstyle-pugin.properties";
        assertThat(new CheckstyleVersion().getVersion(version)).isEmpty();
    }
}
