package kristenores.mod.entity.ZombieZombie;

import net.minecraft.entity.ai.EntityAIAttackMelee;

/**
 * Custom AI attack class to support raising of the arms when the zombie attacks
 */
public class EntityAIZombieZombieAttack extends EntityAIAttackMelee {
    private int raiseArmTicks;
    private EntityZombieZombie zombieZombie;

    public EntityAIZombieZombieAttack(EntityZombieZombie zombieIn, double speedIn, boolean longMemoryIn) {
        super(zombieIn, speedIn, longMemoryIn);
        this.zombieZombie = zombieIn;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    @Override
    public void startExecuting() {
        super.startExecuting();
        this.raiseArmTicks = 0;
    }

    /**
     * Resets the task
     */
    @Override
    public void resetTask() {
        super.resetTask();
        this.zombieZombie.setArmsRaised(false);
    }

    /**
     * Updates the task
     */
    @Override
    public void updateTask() {
        super.updateTask();
        ++this.raiseArmTicks;

        if (this.raiseArmTicks >= 5 && this.attackTick < 10) {
            this.zombieZombie.setArmsRaised(true);
        } else {
            this.zombieZombie.setArmsRaised(false);
        }
    }
}
