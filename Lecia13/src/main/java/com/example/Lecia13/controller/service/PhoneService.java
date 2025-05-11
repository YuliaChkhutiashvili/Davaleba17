package com.example.Lecia13.controller.service;

import model.Phone;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

    @Service
    public class PhoneService {
        private static final List<Phone> phones = new ArrayList<>();
        private Object oldPhone;

        public Phone createPhone(Phone phone) {
            phones.add(phone);
            return phone;
        }

        public void deletePhone(int index) {
            phones.remove(index);
        }

        public Phone updatePhone(Integer index, Phone phone) {
            if (index < phones.size() && index > -1) {
                Phone oldPhone = phones.get(index);
                oldPhone.getClass(phone.getBrandName());
                oldPhone.getClass(phone.getModelName());

            }
            return phone;
        }

        public Phone getPhone(int index) {
            Phone phone = new Phone();
            getClass(phone.getModelName());
            oldPhone.getClass();
            return phones.get(index);
        }

        private void getClass(Object modelName) {

        }

        public List<Phone> getPhones() {

            return phones;
        }
    }
