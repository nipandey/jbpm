/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.jbpm.services.task.audit.commands;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.jbpm.query.jpa.data.QueryWhere;
import org.jbpm.services.task.audit.impl.model.AuditTaskImpl;
import org.kie.internal.task.api.AuditTask;

@XmlRootElement(name="task-query-where-command")
@XmlAccessorType(XmlAccessType.FIELD)
public class AuditTaskQueryCommand extends AbstractTaskAuditQueryCommand<AuditTask, AuditTaskImpl> {

    private static final long serialVersionUID = -6567926743616254900L;

    @XmlElement
    private QueryWhere queryWhere;

    public AuditTaskQueryCommand() {
        // JAXB constructor
    }

    public AuditTaskQueryCommand(QueryWhere queryWhere) {
        this.queryWhere = queryWhere;
    }

    public QueryWhere getQueryWhere() {
        return queryWhere;
    }

    public void setQueryWhere( QueryWhere queryWhere ) {
        this.queryWhere = queryWhere;
    }

    @Override
    protected Class<AuditTask> getResultType() {
        return AuditTask.class;
    }

    @Override
    protected Class<AuditTaskImpl> getQueryType() {
        return AuditTaskImpl.class;
    }

}
