package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.Checkout;
import com.tradenity.sdk.model.LineItem;
import com.tradenity.sdk.model.ShoppingCart;
import com.tradenity.sdk.resources.ShoppingCartResource;
import retrofit2.Call;

import java.util.List;


/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 3:06 PM
 */
public class ShoppingCartService extends AbstractService{

    ShoppingCartResource shoppingCartResource;

    public ShoppingCartService(TradenityClient client) {
        super(client, "brands");
    }

    protected ShoppingCartResource getShoppingCartResource(){
        if(shoppingCartResource == null) {
            shoppingCartResource = resourceFactory.create(ShoppingCartResource.class);
        }
        return shoppingCartResource;
    }

    public ShoppingCart get(){
        Call<ShoppingCart> call =  getShoppingCartResource().index();
        return createInstance(call);
    }

    public Checkout checkout(){
        Call<Checkout> call =  getShoppingCartResource().checkout();
        return createInstance(call);
    }

    public List<LineItem> findAll(){
        Call<List<LineItem>> call =  getShoppingCartResource().items();
        return createList(call);
    }

    public LineItem findById(String id){
        Call<LineItem> call =  getShoppingCartResource().findOne(id);
        return createInstance(call);
    }

    public ShoppingCart addItem(LineItem item){
        Call<ShoppingCart> call =  getShoppingCartResource().save(item.toMap());
        ShoppingCart sc = createInstance(call);
        return sc;
    }

    public ShoppingCart update(LineItem item){
        Call<ShoppingCart> call =  getShoppingCartResource().update(item.getId(), item.toMap());
        return createInstance(call);
    }

    public ShoppingCart delete(String id){
        Call<ShoppingCart> call =  getShoppingCartResource().delete(id);
        return run(call);
    }

    public ShoppingCart update(String itemId, Integer quantity) {
        return update(new LineItem(itemId, quantity));
    }
}
