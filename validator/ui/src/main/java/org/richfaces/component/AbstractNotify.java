/*
 * JBoss, Home of Professional Open Source
 * Copyright , Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.richfaces.component;

import javax.faces.component.UIComponentBase;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.Facet;
import org.richfaces.cdk.annotations.JsfComponent;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.cdk.annotations.Tag;

/**
 * @author <a href="mailto:lfryc@redhat.com">Lukas Fryc</a>
 */
@JsfComponent(tag = @Tag(name = "notify"), type = AbstractNotify.COMPONENT_TYPE, family = AbstractNotify.COMPONENT_FAMILY, generate = "org.richfaces.component.UINotify", renderer = @JsfRenderer(type = "org.richfaces.NotifyRenderer"), facets = {
        @Facet(name = "summary", description = @Description("Summary of the notification message")),
        @Facet(name = "detail", description = @Description("Detail of the notification message")) })
public abstract class AbstractNotify extends UIComponentBase implements NotifyAttributes {

    public static final String COMPONENT_FAMILY = "org.richfaces.Notify";
    public static final String COMPONENT_TYPE = "org.richfaces.Notify";

    public static final double DEFAULT_NONBLOCKING_OPACITY = .2;

    @Attribute(description = @Description("Summary of the notification message"))
    public abstract String getSummary();

    public abstract void setSummary(String summary);

    @Attribute(description = @Description("Detail of the notification message"))
    public abstract String getDetail();

    public abstract void setDetail(String text);
}
