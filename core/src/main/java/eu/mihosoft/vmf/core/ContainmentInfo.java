/*
 * Copyright 2017-2019 Michael Hoffer <info@michaelhoffer.de>. All rights reserved.
 * Copyright 2017-2019 Goethe Center for Scientific Computing, University Frankfurt. All rights reserved.
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
 *
 * If you use this software for scientific research then please cite the following publication(s):
 *
 * M. Hoffer, C. Poliwoda, & G. Wittum. (2013). Visual reflection library:
 * a framework for declarative GUI programming on the Java platform.
 * Computing and Visualization in Science, 2013, 16(4),
 * 181–192. http://doi.org/10.1007/s00791-014-0230-y
 */
package eu.mihosoft.vmf.core;

/**
 * <p>Created by miho on 06.01.2017.</p>
 * 
 * @author Michael Hoffer <info@michaelhoffer.de>
 */
@Deprecated
public final class ContainmentInfo {
    private final ModelType thiz;
    private final Prop thisProp;
    private final ModelType other;
    private final Prop opposite;
    private final ContainmentType containmentType;

    private ContainmentInfo(ModelType thiz, Prop thisProp, ModelType other, Prop opposite, ContainmentType containmentType) {
        this.thiz = thiz;
        this.thisProp = thisProp;
        this.other = other;
        this.opposite = opposite;
        this.containmentType = containmentType;
    }

    public static ContainmentInfo newInstance(ModelType thiz, Prop thisProp, ModelType other, Prop opposite, ContainmentType containmentType) {
        return new ContainmentInfo(thiz, thisProp, other, opposite, containmentType);
    }

    public ModelType getThiz() {
        return thiz;
    }

    public Prop getThisProp() { return thisProp; }

    public ModelType getOther() {
        return other;
    }

    public Prop getOpposite() {
        return opposite;
    }

    public ContainmentType getContainmentType() {
        return containmentType;
    }

}
