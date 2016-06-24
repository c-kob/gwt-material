package gwt.material.design.client.ui;

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

import gwt.material.design.client.base.MaterialWidget;

import com.google.gwt.dom.client.Document;

//@formatter:off
/**
* Card Element for revealed content once title is triggered. 
* @author kevzlou7979
* @author Ben Dol
* @see <a href="http://gwtmaterialdesign.github.io/gwt-material-demo/#!cards">Material Cards</a>
*/
//@formatter:on
public class MaterialCardReveal extends MaterialWidget {

    public MaterialCardReveal() {
        super(Document.get().createDivElement(), "card-reveal");
    }
}