/*
 * Copyright 2016 Groupon, Inc
 * Copyright 2016 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.catalog.api;

import java.math.BigDecimal;

public interface SimplePlanDescriptor {

    /**
     *
     * @return the unique ID for the plan. If not provided, this is allocated by the system.
     */
    String getPlanId();

    /**
     * Allows to group different plans together (e.g similar plans with different currencies)
     *
     * @return the group ID for the plan. If not provided, equals to {@code getPlanId}.
     */
    String getPlanGroupId();

    /**
     *
     * @return the user friendly name of the plan (or the key in the catalog translation resource)
     */
    String getPlanName();

    /**
     *
     * @return the currency
     */
    Currency getCurrency();

    /**
     *
     * @return the recurring price amount
     */
    BigDecimal getAmount();

    /**
     *
     * @return thr recurring billing period
     */
    BillingPeriod getBillingPeriod();

    /**
     * @return the length of the trial. Set to 0 if not trial.
     */
    int getTrialLength();

    /**
     *
     * @return thr trial period. Set to NO_BILLING_PERIOD if not trial.
     */
    BillingPeriod getTrialPeriod();
}
