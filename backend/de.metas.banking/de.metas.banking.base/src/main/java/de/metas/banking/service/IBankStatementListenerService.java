package de.metas.banking.service;

import java.util.List;

import de.metas.banking.BankStatementLineReferenceList;
import de.metas.banking.payment.PaymentLinkResult;
import de.metas.util.ISingletonService;
import lombok.NonNull;

/*
 * #%L
 * de.metas.banking.base
 * %%
 * Copyright (C) 2016 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

/**
 * {@link IBankStatementListener} factory service.
 * 
 * @author metas-dev <dev@metasfresh.com>
 *
 */
public interface IBankStatementListenerService extends ISingletonService
{
	/** Register a new listener */
	void addListener(IBankStatementListener listener);

	void firePaymentLinked(@NonNull PaymentLinkResult payment);

	void firePaymentsLinked(@NonNull List<PaymentLinkResult> payments);

	void firePaymentsUnlinkedFromBankStatementLineReferences(@NonNull BankStatementLineReferenceList lineRefs);
}
