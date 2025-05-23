package Model;

import Model.Items.ArtisanGoods;
import Model.Items.Tool;
import Model.Items.WateringCan;
import enums.CraftingRecipesEnums;

import java.util.ArrayList;
import java.util.HashMap;

public class Player extends User {
    private int daysAfterGash = 0;
    protected User Owner;
    protected int Energy;
    protected int maxEnergy = 200;
    protected int x;
    protected int y;
    protected Farm myFarm;
    protected boolean UnlimitedEnergy;
    protected Skill FarmingSkill;
    protected Skill ExtractionSkill;
    protected Skill ForagingSkill;
    protected Skill FishingSkill;
    protected Buff FoodBuff;
    protected int wood;
    protected int gold;
    protected int money;
    protected ArrayList<Cookingrecipe> CookingRecipes;
    protected ArrayList<CraftingRecipesEnums> CraftingRecipes;
    protected Inventory inventory;
    protected ArrayList<ArtisanGoods> artisansInProduce;
    protected Tool inMyHandTool = null;
    public Player() {
        //super(this.getUsername(),this.getPassword(),this.getEmail(),this.getGender(),this.getNickName());
        super();
        this.Owner = new User();
        this.Energy = 0;
        this.myFarm = new Farm();
        this.UnlimitedEnergy = false;
        this.FarmingSkill = new Skill();
        this.ExtractionSkill = new Skill();
        this.ForagingSkill = new Skill();
        this.FishingSkill = new Skill();
        this.FoodBuff = new Buff();
        this.wood = 0;
        this.gold = 0;
        this.money = 0;
        this.CookingRecipes = new ArrayList<>();
        this.CraftingRecipes = new ArrayList<>();
        this.artisansInProduce = new ArrayList<>();
        this.inventory = new Inventory(12, "initial");
        WateringCan wateringCan = new WateringCan("initial", 5, 40, 40);
        this.inventory.addItem(wateringCan, 1);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void faintController() {

    }

    public User getOwner() {
        return Owner;
    }

    public void setOwner(User owner) {
        Owner = owner;
    }

    public int getEnergy() {
        return Energy;
    }

    public void setEnergy(int energy) {
        Energy = energy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Farm getMyFarm() {
        return myFarm;
    }

    public void setMyFarm(Farm myFarm) {
        this.myFarm = myFarm;
    }

    public boolean isUnlimitedEnergy() {
        return UnlimitedEnergy;
    }

    public void setUnlimitedEnergy(boolean unlimitedEnergy) {
        UnlimitedEnergy = unlimitedEnergy;
    }

    public Skill getFarmingSkill() {
        return FarmingSkill;
    }

    public void setFarmingSkill(Skill farmingSkill) {
        FarmingSkill = farmingSkill;
    }

    public Skill getExtractionSkill() {
        return ExtractionSkill;
    }

    public void setExtractionSkill(Skill extractionSkill) {
        ExtractionSkill = extractionSkill;
    }

    public Skill getForagingSkill() {
        return ForagingSkill;
    }

    public void setForagingSkill(Skill foragingSkill) {
        ForagingSkill = foragingSkill;
    }

    public Skill getFishingSkill() {
        return FishingSkill;
    }

    public void setFishingSkill(Skill fishingSkill) {
        FishingSkill = fishingSkill;
    }

    public Buff getFoodBuff() {
        return FoodBuff;
    }

    public void setFoodBuff(Buff foodBuff) {
        FoodBuff = foodBuff;
    }

    public ArrayList<Cookingrecipe> getCookingRecipes() {
        return CookingRecipes;
    }

    public void setCookingRecipes(ArrayList<Cookingrecipe> cookingrecipes) {
        CookingRecipes = cookingrecipes;
    }

    public ArrayList<CraftingRecipesEnums> getCraftingRecipes() {
        return CraftingRecipes;
    }

    public void setCraftingRecipes(ArrayList<CraftingRecipesEnums> craftingRecipes) {
        CraftingRecipes = craftingRecipes;
    }

    public ArrayList<ArtisanGoods> getArtisansInProduce() {
        return artisansInProduce;
    }

    public void setArtisansInProduce(ArrayList<ArtisanGoods> artisansInProduce) {
        this.artisansInProduce = artisansInProduce;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    public Tool getInMyHandTool() {
        return inMyHandTool;
    }

    public void setInMyHandTool(Tool inMyHandTool) {
        this.inMyHandTool = inMyHandTool;
    }


    public int getDaysAfterGash() {
        return daysAfterGash;
    }

    public void setDaysAfterGash(int daysAfterGash) {
        this.daysAfterGash = daysAfterGash;
    }
}
