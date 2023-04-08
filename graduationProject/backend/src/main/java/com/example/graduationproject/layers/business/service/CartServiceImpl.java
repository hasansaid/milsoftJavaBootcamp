package com.example.graduationproject.layers.business.service;

import com.example.graduationproject.layers.business.dto.CartDto;
import com.example.graduationproject.layers.business.dto.CartProductDto;
import com.example.graduationproject.layers.business.dto.ProductDto;
import com.example.graduationproject.layers.data.entity.Cart;
import com.example.graduationproject.layers.data.entity.CartProduct;
import com.example.graduationproject.layers.data.entity.CartStatus;
import com.example.graduationproject.layers.data.entity.Product;
import com.example.graduationproject.layers.data.repository.CartProductRepository;
import com.example.graduationproject.layers.data.repository.CartRepository;
import com.example.graduationproject.layers.data.repository.ProductRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private CartProductRepository cartProductRepository;
    @Autowired
    private ProductRepository productRepository;


    @SneakyThrows
    @Override
    public CartDto getCartById(int cartId)  {
        Optional<Cart> optionalCart = cartRepository.findByCartId(cartId);
        if (optionalCart.isPresent()) {
            Cart cart = optionalCart.get();
            List<CartProduct> cartProducts = cartProductRepository.findByCart_CartId(cartId);
            List<CartProductDto> cartProductDTOs = new ArrayList<>();
            for (CartProduct cartProduct : cartProducts) {
                ProductDto productDTO = new ProductDto();
                Product product = cartProduct.getProduct();
                productDTO.setProductId(product.getProductId());
                productDTO.setProductName(product.getProductName());
                productDTO.setSalesPrice(product.getSalesPrice());

                CartProductDto cartProductDTO = new CartProductDto();
                cartProductDTO.setCartProductId(cartProduct.getCartProductId());
                cartProductDTO.setProduct(productDTO);
                cartProductDTO.setSalesQuantity(cartProduct.getSalesQuantity());

                cartProductDTOs.add(cartProductDTO);
            }
            CartDto cartDTO = new CartDto();
            cartDTO.setCartId(cart.getCartId());
            cartDTO.setCustomerName(cart.getCustomerName());
            cartDTO.setCardNumber(cart.getCardNumber());
            cartDTO.setCartStatus(cart.getCartStatus());
            cartDTO.setCartProducts(cartProductDTOs);
            return cartDTO;
        } else {
                throw new Exception("Sepet bulunamadı id : " + cartId);
        }
    }

    @SneakyThrows
    @Override
    public void addProductToCart(int cartId, int productId, int quantity) {
        Optional<Cart> optionalCart = cartRepository.findByCartId(cartId);
        Optional<Product> optionalProduct = productRepository.findByProductId(productId);
        if (optionalCart.isPresent() && optionalProduct.isPresent()) {
            Cart cart = optionalCart.get();
            Product product = optionalProduct.get();
            Optional<CartProduct> optionalCartProduct = cartProductRepository.findByCart_CartIdAndProduct_ProductId(cartId, productId);
            CartProduct cartProduct;
            if (optionalCartProduct.isPresent()) {
                cartProduct = optionalCartProduct.get();
                cartProduct.setSalesQuantity(cartProduct.getSalesQuantity() + quantity);
            } else {
                cartProduct = new CartProduct();
                cartProduct.setCart(cart);
                cartProduct.setProduct(product);
                cartProduct.setSalesQuantity(quantity);
            }
            cartProductRepository.save(cartProduct);
        } else {
            throw new Exception("Cart or product not found with id " + cartId + " or " + productId);
        }
    }
    @SneakyThrows
    @Override
    public void minusProductToCart(int cartId, int productId, int quantity) {
        Optional<Cart> optionalCart = cartRepository.findByCartId(cartId);
        Optional<Product> optionalProduct = productRepository.findByProductId(productId);
        if (optionalCart.isPresent() && optionalProduct.isPresent()) {
            Cart cart = optionalCart.get();
            Product product = optionalProduct.get();
            Optional<CartProduct> optionalCartProduct = cartProductRepository.findByCart_CartIdAndProduct_ProductId(cartId, productId);
            CartProduct cartProduct;
            if (optionalCartProduct.isPresent()) {
                cartProduct = optionalCartProduct.get();
               if(cartProduct.getSalesQuantity()>1){
                   cartProduct.setSalesQuantity(cartProduct.getSalesQuantity() - quantity);
               }
            } else {
                cartProduct = new CartProduct();
                cartProduct.setCart(cart);
                cartProduct.setProduct(product);
                cartProduct.setSalesQuantity(quantity);
            }
            cartProductRepository.save(cartProduct);
        } else {
            throw new Exception("Cart or product not found with id " + cartId + " or " + productId);
        }
    }

    @SneakyThrows
    @Override
    public void removeProductFromCart(int cartId, int productId) {
        Optional<CartProduct> optionalCartProduct = cartProductRepository.findByCart_CartIdAndProduct_ProductId(cartId, productId);
        if (optionalCartProduct.isPresent()) {
            CartProduct cartProduct = optionalCartProduct.get();
            cartProductRepository.delete(cartProduct);
        } else {
            throw new Exception("Product not found in cart with id " + cartId);
        }
    }

    @SneakyThrows
    @Override
    public void checkoutCart(int cartId) {
        Optional<Cart> optionalCart = cartRepository.findByCartId(cartId);
        if (optionalCart.isPresent()) {Cart cart = optionalCart.get();
            cart.setCartStatus(CartStatus.COMPLETED);
            cartRepository.save(cart);
        } else {
            throw new Exception("Sepet bulunamadı id : " + cartId);
        }
    }

    @SneakyThrows
    @Override
    public void reCheckoutCart(int cartId) {
        Optional<Cart> optionalCart = cartRepository.findByCartId(cartId);
        if (optionalCart.isPresent()) {Cart cart = optionalCart.get();
            cart.setCartStatus(CartStatus.NEW);
            cartRepository.save(cart);
        } else {
            throw new Exception("Sepet bulunamadı id : " + cartId);
        }
    }


}


