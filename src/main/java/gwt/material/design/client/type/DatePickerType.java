package gwt.material.design.client.type;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 GwtMaterialDesign
 * %%
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
 * #L%
 */

import com.google.gwt.dom.client.Style;
import gwt.material.design.client.custom.Type;

/**
 * Types of Collection<br>
 * - AVATAR<br>
 * - DISMISSABLE<br>
 * @author kevzlou7979
 */
public enum DatePickerType implements Type, Style.HasCssName {
	DAY("day"),
	MONTH_DAY("month_day"),
	YEAR_MONTH_DAY("year_month_day"),
	YEAR("year");

	private final String cssClass;

	DatePickerType(final String cssClass) {
		this.cssClass = cssClass;
	}

	@Override
	public String getCssName() {
		return cssClass;
	}

	/**
	 * Get Type from String.
	 */
	public static DatePickerType fromString(String text) {
		if (text != null) {
			for (DatePickerType b : DatePickerType.values()) {
				if (text.equalsIgnoreCase(b.getCssName())) {
					return b;
				}
			}
		}
		return null;
	}
}
