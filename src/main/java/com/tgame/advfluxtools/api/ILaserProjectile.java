package com.tgame.advfluxtools.api;

import com.tgame.advfluxtools.entities.EntityLaserProjectile;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

/**
 * @author tgame14
 * @since 07/05/14
 */
public interface ILaserProjectile
{
	void onImpact(World world, EntityLaserProjectile projectile, MovingObjectPosition hit);
}
