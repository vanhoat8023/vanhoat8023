let customer = function () {
    this.setName = function (name) {
        this.name = name;
    };
    this.getname = function () {
        return this.name;
    };
    this.setCMND = function (cmnd) {
        this.cmnd = cmnd;
    };
    this.getCMND = function () {
        return this.cmnd;
    };
    this.setBirthday = function (birthday) {
        this.birthday = birthday;
    };
    this.getBirthday = function () {
        return this.birthday;
    };
    this.setEmail = function (email) {
        this.email = email;
    };
    this.getEmail = function () {
        return this.email;
    };
    this.setAddress = function (address) {
        this.address = address;
    };
    this.getAddress = function () {
        return this.address;
    };
    this.setTypeCustomer = function (typeCustomer) {
        this.typecustomer = typecustomer;
    };
    this.getTypeCustomer = function () {
        return this.typecustomer;
    };
    this.setDiscount = function (discount) {
        this.discount = discount;
    };
    this.getDiscount = function () {
        return this.discount;
    };
    this.setQuantytiIncluded = function (quantytiIncluded) {
        this.quantytiIncluded = quantytiIncluded;
    };
    this.getQuantytiIncluded = function () {
        return this.quantytiIncluded;
    };
    this.setTyperoom = function (typeroom) {
        this.typeroom = typeroom;
    };
    this.getTyperoom = function () {
        return this.typeroom;
    };
    this.setRentDays = function (rentdays) {
        this.rentDays = rentDays;
    };
    this.getRentDAys = function () {
        return this.rentDays;
    };
    this.setTypeService = function (typeSevice) {
        this.typeSevice = typeSevice;
    };
    this.getTypeSevice = function () {
        return this.typeSevice;
    };
    this.TotalPays = function () {
        let money = 0;
        if (this.getTypeSevice() === "villa") {
            money = 500;
        } else if (this.getTypeSevice() === "House") {
            money = 300;
        } else if (this.getTypeSevice() === "Room") {
            money = 200;
        }
        return this.getRentDAys() * money * (1 - this.getDiscount() / 100);
    }
};