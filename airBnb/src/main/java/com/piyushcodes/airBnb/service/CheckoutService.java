package com.piyushcodes.airBnb.service;

import com.piyushcodes.airBnb.entity.Booking;
import com.stripe.exception.StripeException;

public interface CheckoutService {
    String getCheckoutSession(Booking booking, String successUrl, String failureUrl) throws StripeException;
}
