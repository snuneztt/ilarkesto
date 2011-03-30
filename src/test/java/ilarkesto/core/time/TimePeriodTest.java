/*
 * Copyright 2011 Witoslaw Koczewsi <wi@koczewski.de>
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package ilarkesto.core.time;

import ilarkesto.testng.ATest;

import org.testng.annotations.Test;

public class TimePeriodTest extends ATest {

	@Test
	public void toShortestString() {
		assertEquals(new TimePeriod(Tm.SECOND * 20).toShortestString("en"), "20 seconds");
		assertEquals(new TimePeriod(Tm.MINUTE).toShortestString("en"), "1 minute");
		assertEquals(new TimePeriod(Tm.HOUR * 3).toShortestString("en"), "3 hours");
		assertEquals(new TimePeriod(Tm.DAY * 7).toShortestString("en"), "7 days");
		assertEquals(new TimePeriod(Tm.WEEK * 2).toShortestString("en"), "2 weeks");
		assertEquals(new TimePeriod(Tm.MONTH * 11).toShortestString("en"), "11 months");
	}

	@Test
	public void constructorMillis() {
		assertEquals(new TimePeriod("1").toMillis(), 1);
	}

	@Test
	public void constructorTime() {
		assertEquals(new TimePeriod("0:0:0:1").toMillis(), 1);
	}

}