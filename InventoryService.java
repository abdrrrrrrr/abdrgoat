
package com.ecommerce;

/**
 * Subsystem Class 1: InventoryService
 * Responsible for verifying and allocating product inventory.
 */
public class InventoryService {

    public boolean sufficientStock(String productId) {
        if (productId == null || productId.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean checkStock(String productId) {
        System.out.println(
                "[InventoryService] Step 1: Checking stock levels for item: "
                        + productId
        );

        return sufficientStock(productId);
    }

    public void reserve(String productId) {
        System.out.println(
                "[InventoryService] Step 2: Stock reserved successfully for item: "
                        + productId
        );
    }
}
