/**
 * This file is part of org.everit.cookbook.core.
 *
 * org.everit.cookbook.core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * org.everit.cookbook.core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with org.everit.cookbook.core.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.cookbook;

import java.io.Serializable;

public final class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    public long userId;

    public String firstName;

    public String lastName;

    public UserDTO(ImmutableUser immutableUser) {
        this.userId = immutableUser.getUserId();
        this.firstName = immutableUser.getFirstName();
        this.lastName = immutableUser.getLastName();
    }

    public UserDTO() {
    }

    public UserDTO lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserDTO firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserDTO userId(long userId) {
        this.userId = userId;
        return this;
    }
}
